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

public val BoldGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.37f, 60.27f)
                curveTo(188.08f, 49.62f, 160.0f, 44.0f, 128.0f, 44.0f)
                reflectiveCurveTo(67.92f, 49.62f, 46.63f, 60.27f)
                curveTo(24.62f, 71.27f, 12.0f, 87.21f, 12.0f, 104.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 16.79f, 12.62f, 32.73f, 34.63f, 43.73f)
                curveTo(67.92f, 206.38f, 96.05f, 212.0f, 128.0f, 212.0f)
                reflectiveCurveToRelative(60.08f, -5.62f, 81.37f, -16.27f)
                curveToRelative(22.0f, -11.0f, 34.63f, -26.94f, 34.63f, -43.73f)
                lineTo(244.0f, 104.0f)
                curveTo(244.0f, 87.21f, 231.38f, 71.27f, 209.37f, 60.27f)
                close()
                moveTo(57.37f, 81.73f)
                curveTo(75.08f, 72.88f, 100.16f, 68.0f, 128.0f, 68.0f)
                reflectiveCurveToRelative(52.92f, 4.88f, 70.63f, 13.73f)
                curveTo(211.81f, 88.32f, 220.0f, 96.86f, 220.0f, 104.0f)
                reflectiveCurveToRelative(-8.19f, 15.68f, -21.37f, 22.27f)
                curveTo(180.92f, 135.12f, 155.84f, 140.0f, 128.0f, 140.0f)
                reflectiveCurveToRelative(-52.92f, -4.88f, -70.63f, -13.73f)
                curveTo(44.19f, 119.68f, 36.0f, 111.14f, 36.0f, 104.0f)
                reflectiveCurveTo(44.19f, 88.32f, 57.37f, 81.73f)
                close()
                moveTo(180.0f, 181.38f)
                arcToRelative(180.38f, 180.38f, 0.0f, false, true, -40.0f, 6.3f)
                verticalLineToRelative(-24.0f)
                arcToRelative(210.39f, 210.39f, 0.0f, false, false, 40.0f, -5.51f)
                close()
                moveTo(76.0f, 158.22f)
                arcToRelative(210.39f, 210.39f, 0.0f, false, false, 40.0f, 5.51f)
                verticalLineToRelative(24.0f)
                arcToRelative(180.38f, 180.38f, 0.0f, false, true, -40.0f, -6.3f)
                close()
                moveTo(36.0f, 152.0f)
                lineTo(36.0f, 141.54f)
                arcToRelative(94.54f, 94.54f, 0.0f, false, false, 10.63f, 6.19f)
                curveToRelative(1.74f, 0.87f, 3.54f, 1.7f, 5.37f, 2.5f)
                lineTo(52.0f, 171.3f)
                curveTo(42.0f, 165.24f, 36.0f, 158.11f, 36.0f, 152.0f)
                close()
                moveTo(204.0f, 171.3f)
                lineTo(204.0f, 150.23f)
                curveToRelative(1.83f, -0.8f, 3.63f, -1.63f, 5.37f, -2.5f)
                arcTo(94.54f, 94.54f, 0.0f, false, false, 220.0f, 141.54f)
                lineTo(220.0f, 152.0f)
                curveTo(220.0f, 158.11f, 214.0f, 165.24f, 204.0f, 171.3f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
