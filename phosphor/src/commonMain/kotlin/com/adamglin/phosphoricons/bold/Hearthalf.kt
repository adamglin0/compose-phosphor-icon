package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) {
            return _heartHalf!!
        }
        _heartHalf = Builder(name = "HeartHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.21f, 60.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.42f, -23.59f)
                curveTo(150.5f, 40.0f, 137.49f, 47.2f, 128.08f, 57.66f)
                curveTo(116.0f, 44.0f, 98.14f, 36.0f, 78.0f, 36.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, false, -66.0f, 66.0f)
                curveToRelative(0.0f, 31.0f, 18.91f, 63.0f, 56.2f, 94.87f)
                arcToRelative(342.69f, 342.69f, 0.0f, false, false, 54.11f, 37.7f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 128.0f, 236.0f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, 5.68f, -1.46f)
                verticalLineToRelative(0.0f)
                arcTo(339.75f, 339.75f, 0.0f, false, false, 175.32f, 207.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.64f, -19.0f)
                curveToRelative(-7.48f, 5.76f, -14.63f, 10.72f, -20.68f, 14.68f)
                lineTo(140.0f, 82.55f)
                curveTo(145.43f, 71.23f, 156.31f, 63.32f, 170.21f, 60.72f)
                close()
                moveTo(116.0f, 202.66f)
                arcToRelative(318.88f, 318.88f, 0.0f, false, true, -32.51f, -24.3f)
                curveTo(61.82f, 159.77f, 36.0f, 131.42f, 36.0f, 102.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 78.0f, 60.0f)
                curveToRelative(17.0f, 0.0f, 31.35f, 8.57f, 38.0f, 22.52f)
                close()
                moveTo(233.0f, 107.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.25f, -10.61f)
                arcToRelative(41.89f, 41.89f, 0.0f, false, false, -18.41f, -30.25f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.34f, -19.95f)
                arcTo(65.84f, 65.84f, 0.0f, false, true, 243.6f, 94.68f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 233.0f, 107.93f)
                close()
                moveTo(234.0f, 141.35f)
                curveToRelative(-5.84f, 11.72f, -14.33f, 23.63f, -25.23f, 35.43f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.62f, -16.29f)
                curveToRelative(9.36f, -10.13f, 16.55f, -20.17f, 21.38f, -29.84f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 234.0f, 141.35f)
                close()
            }
        }
        .build()
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
