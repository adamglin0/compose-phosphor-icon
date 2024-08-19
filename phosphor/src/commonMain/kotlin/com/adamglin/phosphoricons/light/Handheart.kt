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

public val LightGroup.Handheart: ImageVector
    get() {
        if (_handheart != null) {
            return _handheart!!
        }
        _handheart = Builder(name = "Handheart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.12f, 142.65f)
                arcToRelative(22.43f, 22.43f, 0.0f, false, false, -19.55f, -3.88f)
                lineToRelative(-4.32f, 1.0f)
                curveTo(227.0f, 119.55f, 238.0f, 99.51f, 238.0f, 80.0f)
                curveToRelative(0.0f, -25.36f, -20.39f, -46.0f, -45.46f, -46.0f)
                arcTo(45.51f, 45.51f, 0.0f, false, false, 156.0f, 52.0f)
                arcToRelative(45.51f, 45.51f, 0.0f, false, false, -36.54f, -18.0f)
                curveTo(94.39f, 34.0f, 74.0f, 54.64f, 74.0f, 80.0f)
                curveToRelative(0.0f, 11.38f, 3.63f, 22.49f, 11.29f, 34.36f)
                arcToRelative(29.73f, 29.73f, 0.0f, false, false, -16.56f, 8.43f)
                lineTo(45.52f, 146.0f)
                lineTo(16.0f, 146.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 2.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(120.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.46f, -0.18f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(7.16f, 7.16f, 0.0f, false, false, 0.89f, -0.3f)
                lineTo(225.17f, 181.0f)
                lineToRelative(0.33f, -0.15f)
                arcToRelative(22.6f, 22.6f, 0.0f, false, false, 3.62f, -38.18f)
                close()
                moveTo(119.46f, 46.0f)
                arcToRelative(33.16f, 33.16f, 0.0f, false, true, 31.0f, 20.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.1f, 0.0f)
                arcToRelative(33.16f, 33.16f, 0.0f, false, true, 31.0f, -20.28f)
                curveTo(210.68f, 46.0f, 226.0f, 61.57f, 226.0f, 80.0f)
                curveToRelative(0.0f, 20.24f, -16.18f, 43.0f, -46.8f, 65.75f)
                lineToRelative(-14.87f, 3.42f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 140.0f, 114.0f)
                lineTo(99.67f, 114.0f)
                curveTo(90.36f, 101.67f, 86.0f, 90.81f, 86.0f, 80.0f)
                curveTo(86.0f, 61.57f, 101.32f, 46.0f, 119.46f, 46.0f)
                close()
                moveTo(14.0f, 200.0f)
                lineTo(14.0f, 160.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(42.0f, 158.0f)
                verticalLineToRelative(44.0f)
                lineTo(16.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 200.0f)
                close()
                moveTo(220.28f, 170.0f)
                lineTo(182.08f, 186.27f)
                lineTo(119.26f, 202.0f)
                lineTo(54.0f, 202.0f)
                lineTo(54.0f, 154.49f)
                lineToRelative(23.21f, -23.22f)
                arcTo(17.88f, 17.88f, 0.0f, false, true, 89.94f, 126.0f)
                lineTo(140.0f, 126.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 28.0f)
                lineTo(112.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.34f, -0.15f)
                lineToRelative(67.0f, -15.41f)
                lineToRelative(0.24f, -0.06f)
                arcTo(10.6f, 10.6f, 0.0f, false, true, 220.28f, 170.0f)
                close()
            }
        }
        .build()
        return _handheart!!
    }

private var _handheart: ImageVector? = null
