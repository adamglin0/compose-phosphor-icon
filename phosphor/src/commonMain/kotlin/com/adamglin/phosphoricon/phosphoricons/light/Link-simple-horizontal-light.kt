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

public val LightGroup.`Link-simple-horizontal-light`: ImageVector
    get() {
        if (`_link-simple-horizontal-light` != null) {
            return `_link-simple-horizontal-light`!!
        }
        `_link-simple-horizontal-light` = Builder(name = "Link-simple-horizontal-light",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 122.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(80.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                close()
                moveTo(104.0f, 170.0f)
                lineTo(64.0f, 170.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, -84.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(64.0f, 74.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, 108.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(192.0f, 74.0f)
                lineTo(152.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, 84.0f)
                lineTo(152.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, -108.0f)
                close()
            }
        }
        .build()
        return `_link-simple-horizontal-light`!!
    }

private var `_link-simple-horizontal-light`: ImageVector? = null
