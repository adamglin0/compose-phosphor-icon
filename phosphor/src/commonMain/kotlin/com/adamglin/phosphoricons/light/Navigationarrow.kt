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

public val LightGroup.Navigationarrow: ImageVector
    get() {
        if (_navigationarrow != null) {
            return _navigationarrow!!
        }
        _navigationarrow = Builder(name = "Navigationarrow", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.65f, 108.1f)
                lineTo(60.72f, 42.83f)
                lineToRelative(-0.13f, 0.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.78f, 60.59f)
                reflectiveCurveToRelative(0.0f, 0.09f, 0.0f, 0.13f)
                lineTo(108.1f, 236.65f)
                arcTo(13.77f, 13.77f, 0.0f, false, false, 121.28f, 246.0f)
                horizontalLineToRelative(0.26f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 13.14f, -9.88f)
                lineToRelative(0.0f, -0.15f)
                lineToRelative(22.14f, -79.1f)
                lineTo(236.0f, 134.73f)
                lineToRelative(0.15f, 0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.53f, -26.58f)
                close()
                moveTo(232.65f, 123.2f)
                lineTo(150.39f, 146.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.16f, 4.16f)
                lineToRelative(-23.0f, 82.26f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, true, -1.86f, 1.36f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -1.92f, -1.35f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, -0.12f)
                lineTo(54.11f, 56.62f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.51f, -2.51f)
                lineToRelative(175.91f, 65.26f)
                lineToRelative(0.12f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.79f)
                close()
            }
        }
        .build()
        return _navigationarrow!!
    }

private var _navigationarrow: ImageVector? = null
