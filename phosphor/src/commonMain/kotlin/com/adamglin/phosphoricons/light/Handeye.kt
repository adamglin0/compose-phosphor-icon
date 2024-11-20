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

public val LightGroup.HandEye: ImageVector
    get() {
        if (_handEye != null) {
            return _handEye!!
        }
        _handEye = Builder(name = "HandEye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.0f, 168.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 168.0f)
                close()
                moveTo(214.0f, 116.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, -172.0f, 0.0f)
                lineTo(42.0f, 76.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 82.0f, 54.11f)
                lineTo(82.0f, 44.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 51.41f, -5.51f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 174.0f, 60.0f)
                lineTo(174.0f, 94.11f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 214.0f, 116.0f)
                close()
                moveTo(202.0f, 116.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(162.0f, 60.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 44.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(82.0f, 76.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, false, 148.0f, 0.0f)
                close()
                moveTo(181.37f, 165.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 5.36f)
                curveTo(180.65f, 172.12f, 163.3f, 206.0f, 128.0f, 206.0f)
                reflectiveCurveToRelative(-52.65f, -33.88f, -53.37f, -35.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -5.36f)
                curveTo(75.35f, 163.88f, 92.7f, 130.0f, 128.0f, 130.0f)
                reflectiveCurveTo(180.65f, 163.88f, 181.37f, 165.32f)
                close()
                moveTo(169.08f, 168.0f)
                curveToRelative(-4.46f, -7.12f, -18.41f, -26.0f, -41.08f, -26.0f)
                reflectiveCurveToRelative(-36.65f, 18.85f, -41.08f, 26.0f)
                curveToRelative(4.46f, 7.13f, 18.41f, 26.0f, 41.08f, 26.0f)
                reflectiveCurveTo(164.65f, 175.15f, 169.08f, 168.0f)
                close()
            }
        }
        .build()
        return _handEye!!
    }

private var _handEye: ImageVector? = null
