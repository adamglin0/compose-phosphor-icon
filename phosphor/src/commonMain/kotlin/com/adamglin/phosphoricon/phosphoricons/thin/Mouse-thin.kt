package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Mouse-thin`: ImageVector
    get() {
        if (`_mouse-thin` != null) {
            return `_mouse-thin`!!
        }
        `_mouse-thin` = Builder(name = "Mouse-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 20.0f)
                lineTo(112.0f, 20.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 52.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, 60.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, -60.0f)
                lineTo(204.0f, 80.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 144.0f, 20.0f)
                close()
                moveTo(196.0f, 80.0f)
                verticalLineToRelative(28.0f)
                lineTo(132.0f, 108.0f)
                lineTo(132.0f, 28.0f)
                horizontalLineToRelative(12.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 196.0f, 80.0f)
                close()
                moveTo(112.0f, 28.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(80.0f)
                lineTo(60.0f, 108.0f)
                lineTo(60.0f, 80.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 112.0f, 28.0f)
                close()
                moveTo(144.0f, 228.0f)
                lineTo(112.0f, 228.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                lineTo(60.0f, 116.0f)
                lineTo(196.0f, 116.0f)
                verticalLineToRelative(60.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 144.0f, 228.0f)
                close()
            }
        }
        .build()
        return `_mouse-thin`!!
    }

private var `_mouse-thin`: ImageVector? = null
