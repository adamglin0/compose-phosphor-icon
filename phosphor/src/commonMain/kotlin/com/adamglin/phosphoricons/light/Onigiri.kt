package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Onigiri: ImageVector
    get() {
        if (_onigiri != null) {
            return _onigiri!!
        }
        _onigiri = Builder(name = "Onigiri", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.82f, 147.6f)
                lineTo(174.0f, 51.67f)
                lineToRelative(-0.09f, -0.15f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -91.74f, 0.0f)
                lineToRelative(-0.09f, 0.15f)
                lineTo(26.18f, 147.6f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 72.09f, 230.0f)
                lineTo(183.91f, 230.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 45.91f, -82.4f)
                close()
                moveTo(162.0f, 218.0f)
                lineTo(94.0f, 218.0f)
                lineTo(94.0f, 168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(220.61f, 196.42f)
                arcTo(41.47f, 41.47f, 0.0f, false, true, 183.91f, 218.0f)
                lineTo(174.0f, 218.0f)
                lineTo(174.0f, 168.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(96.0f, 154.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(50.0f)
                lineTo(72.09f, 218.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -35.67f, -64.15f)
                lineToRelative(0.08f, -0.14f)
                lineTo(92.37f, 57.78f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 71.26f, 0.0f)
                lineToRelative(55.87f, 95.93f)
                lineToRelative(0.08f, 0.14f)
                arcTo(41.48f, 41.48f, 0.0f, false, true, 220.6f, 196.42f)
                close()
            }
        }
        .build()
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
