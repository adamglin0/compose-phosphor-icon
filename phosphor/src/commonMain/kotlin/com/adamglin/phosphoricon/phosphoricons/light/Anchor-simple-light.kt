package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Anchor-simple-light`: ImageVector
    get() {
        if (`_anchor-simple-light` != null) {
            return `_anchor-simple-light`!!
        }
        `_anchor-simple-light` = Builder(name = "Anchor-simple-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 114.0f)
                horizontalLineTo(200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(17.8f)
                arcTo(90.13f, 90.13f, 0.0f, false, true, 134.0f, 209.78f)
                verticalLineTo(93.4f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineTo(209.78f)
                arcTo(90.13f, 90.13f, 0.0f, false, true, 38.2f, 126.0f)
                horizontalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 204.0f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 114.0f)
                close()
                moveTo(110.0f, 64.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 110.0f, 64.0f)
                close()
            }
        }
        .build()
        return `_anchor-simple-light`!!
    }

private var `_anchor-simple-light`: ImageVector? = null
