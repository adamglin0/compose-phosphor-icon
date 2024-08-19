package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Coins: ImageVector
    get() {
        if (_coins != null) {
            return _coins!!
        }
        _coins = Builder(name = "Coins", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 89.57f)
                lineTo(184.0f, 84.0f)
                curveToRelative(0.0f, -25.08f, -37.83f, -44.0f, -88.0f, -44.0f)
                reflectiveCurveTo(8.0f, 58.92f, 8.0f, 84.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 20.89f, 26.25f, 37.49f, 64.0f, 42.46f)
                lineTo(72.0f, 172.0f)
                curveToRelative(0.0f, 25.08f, 37.83f, 44.0f, 88.0f, 44.0f)
                reflectiveCurveToRelative(88.0f, -18.92f, 88.0f, -44.0f)
                lineTo(248.0f, 132.0f)
                curveTo(248.0f, 111.3f, 222.58f, 94.68f, 184.0f, 89.57f)
                close()
                moveTo(56.0f, 146.87f)
                curveTo(36.41f, 141.4f, 24.0f, 132.39f, 24.0f, 124.0f)
                lineTo(24.0f, 109.93f)
                curveToRelative(8.16f, 5.78f, 19.09f, 10.44f, 32.0f, 13.57f)
                close()
                moveTo(136.0f, 123.5f)
                curveToRelative(12.91f, -3.13f, 23.84f, -7.79f, 32.0f, -13.57f)
                lineTo(168.0f, 124.0f)
                curveToRelative(0.0f, 8.39f, -12.41f, 17.4f, -32.0f, 22.87f)
                close()
                moveTo(120.0f, 194.87f)
                curveTo(100.41f, 189.4f, 88.0f, 180.39f, 88.0f, 172.0f)
                verticalLineToRelative(-4.17f)
                curveToRelative(2.63f, 0.1f, 5.29f, 0.17f, 8.0f, 0.17f)
                curveToRelative(3.88f, 0.0f, 7.67f, -0.13f, 11.39f, -0.35f)
                arcTo(121.92f, 121.92f, 0.0f, false, false, 120.0f, 171.41f)
                close()
                moveTo(120.0f, 150.25f)
                arcTo(163.0f, 163.0f, 0.0f, false, true, 96.0f, 152.0f)
                arcToRelative(163.0f, 163.0f, 0.0f, false, true, -24.0f, -1.75f)
                lineTo(72.0f, 126.46f)
                arcTo(183.74f, 183.74f, 0.0f, false, false, 96.0f, 128.0f)
                arcToRelative(183.74f, 183.74f, 0.0f, false, false, 24.0f, -1.54f)
                close()
                moveTo(184.0f, 198.25f)
                arcToRelative(165.45f, 165.45f, 0.0f, false, true, -48.0f, 0.0f)
                lineTo(136.0f, 174.4f)
                arcToRelative(179.48f, 179.48f, 0.0f, false, false, 24.0f, 1.6f)
                arcToRelative(183.74f, 183.74f, 0.0f, false, false, 24.0f, -1.54f)
                close()
                moveTo(232.0f, 172.0f)
                curveToRelative(0.0f, 8.39f, -12.41f, 17.4f, -32.0f, 22.87f)
                lineTo(200.0f, 171.5f)
                curveToRelative(12.91f, -3.13f, 23.84f, -7.79f, 32.0f, -13.57f)
                close()
            }
        }
        .build()
        return _coins!!
    }

private var _coins: ImageVector? = null
