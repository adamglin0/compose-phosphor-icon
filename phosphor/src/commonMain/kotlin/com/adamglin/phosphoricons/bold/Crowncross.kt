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

public val BoldGroup.CrownCross: ImageVector
    get() {
        if (_crownCross != null) {
            return _crownCross!!
        }
        _crownCross = Builder(name = "CrownCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 56.0f)
                curveToRelative(-15.4f, 0.0f, -29.19f, 4.61f, -40.0f, 12.5f)
                lineTo(140.0f, 44.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 20.0f)
                lineTo(140.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(104.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(116.0f, 68.5f)
                curveTo(105.19f, 60.61f, 91.4f, 56.0f, 76.0f, 56.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, 64.0f)
                curveToRelative(0.0f, 31.66f, 15.53f, 50.6f, 28.55f, 60.91f)
                arcTo(85.75f, 85.75f, 0.0f, false, false, 60.0f, 192.45f)
                lineTo(60.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(196.0f, 192.45f)
                arcToRelative(85.75f, 85.75f, 0.0f, false, false, 19.45f, -11.54f)
                curveTo(228.47f, 170.6f, 244.0f, 151.66f, 244.0f, 120.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 180.0f, 56.0f)
                close()
                moveTo(181.09f, 172.36f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 184.0f)
                verticalLineToRelative(20.0f)
                lineTo(84.0f, 204.0f)
                lineTo(84.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.09f, -11.64f)
                arcToRelative(59.4f, 59.4f, 0.0f, false, true, -19.46f, -10.27f)
                curveTo(42.54f, 151.87f, 36.0f, 137.71f, 36.0f, 120.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 76.0f, 80.0f)
                curveToRelative(23.18f, 0.0f, 40.0f, 15.14f, 40.0f, 36.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 116.0f)
                curveToRelative(0.0f, -20.86f, 16.82f, -36.0f, 40.0f, -36.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                curveTo(220.0f, 161.68f, 182.62f, 172.0f, 181.09f, 172.36f)
                close()
            }
        }
        .build()
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
