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

public val LightGroup.Farm: ImageVector
    get() {
        if (_farm != null) {
            return _farm!!
        }
        _farm = Builder(name = "Farm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcToRelative(230.11f, 230.11f, 0.0f, false, false, -66.11f, 9.65f)
                arcToRelative(260.34f, 260.34f, 0.0f, false, false, -23.07f, -13.28f)
                arcTo(248.25f, 248.25f, 0.0f, false, true, 232.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                curveToRelative(-6.0f, 0.0f, -12.0f, 0.22f, -18.0f, 0.62f)
                lineTo(214.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.4f, -4.8f)
                lineToRelative(-64.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.2f, 0.0f)
                lineToRelative(-64.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 74.0f, 80.0f)
                verticalLineToRelative(38.77f)
                arcTo(264.25f, 264.25f, 0.0f, false, false, 24.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(249.0f, 249.0f, 0.0f, false, true, 195.17f, 93.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.69f, 2.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.67f, -9.75f)
                arcToRelative(265.0f, 265.0f, 0.0f, false, false, -18.69f, -20.94f)
                arcTo(190.58f, 190.58f, 0.0f, false, true, 232.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcToRelative(199.1f, 199.1f, 0.0f, false, false, -33.21f, 2.79f)
                quadToRelative(-9.63f, -8.65f, -20.0f, -16.25f)
                arcTo(218.72f, 218.72f, 0.0f, false, true, 232.0f, 158.0f)
                close()
                moveTo(126.0f, 134.56f)
                lineTo(126.0f, 102.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(21.46f)
                arcToRelative(259.11f, 259.11f, 0.0f, false, false, -33.93f, 12.0f)
                close()
                moveTo(86.0f, 83.0f)
                lineToRelative(58.0f, -43.5f)
                lineTo(202.0f, 83.0f)
                verticalLineToRelative(32.71f)
                arcToRelative(260.51f, 260.51f, 0.0f, false, false, -28.0f, 4.73f)
                lineTo(174.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(120.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(33.85f)
                arcToRelative(258.87f, 258.87f, 0.0f, false, false, -28.0f, -8.46f)
                close()
                moveTo(135.17f, 219.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.32f, 1.68f)
                arcTo(185.14f, 185.14f, 0.0f, false, false, 24.0f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(197.1f, 197.1f, 0.0f, false, true, 109.49f, 33.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 135.17f, 219.32f)
                close()
                moveTo(184.97f, 211.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.4f, 8.57f)
                arcTo(216.79f, 216.79f, 0.0f, false, false, 24.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcTo(228.74f, 228.74f, 0.0f, false, true, 185.0f, 211.71f)
                close()
            }
        }
        .build()
        return _farm!!
    }

private var _farm: ImageVector? = null
