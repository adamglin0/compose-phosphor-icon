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

public val LightGroup.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 130.0f)
                arcToRelative(21.84f, 21.84f, 0.0f, false, false, -10.0f, 2.41f)
                lineTo(214.0f, 128.0f)
                curveToRelative(0.0f, -40.71f, -29.31f, -60.22f, -52.87f, -75.9f)
                curveTo(146.57f, 42.41f, 134.0f, 34.0f, 134.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                curveToRelative(0.0f, 10.0f, -12.57f, 18.41f, -27.13f, 28.1f)
                curveTo(71.31f, 67.78f, 42.0f, 87.29f, 42.0f, 128.0f)
                verticalLineToRelative(4.41f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 10.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(80.0f, 214.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(86.0f, 176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(150.0f, 176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(246.0f, 152.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 224.0f, 130.0f)
                close()
                moveTo(101.52f, 62.09f)
                curveToRelative(10.37f, -6.9f, 20.38f, -13.56f, 26.48f, -21.57f)
                curveToRelative(6.1f, 8.0f, 16.11f, 14.67f, 26.48f, 21.57f)
                curveTo(175.41f, 76.0f, 199.0f, 91.71f, 201.73f, 122.0f)
                lineTo(54.27f, 122.0f)
                curveTo(57.0f, 91.71f, 80.59f, 76.0f, 101.52f, 62.09f)
                close()
                moveTo(22.0f, 152.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                verticalLineToRelative(50.0f)
                lineTo(22.0f, 202.0f)
                close()
                moveTo(160.0f, 154.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(26.0f)
                lineTo(118.0f, 202.0f)
                lineTo(118.0f, 176.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -44.0f, 0.0f)
                verticalLineToRelative(26.0f)
                lineTo(54.0f, 202.0f)
                lineTo(54.0f, 134.0f)
                lineTo(202.0f, 134.0f)
                verticalLineToRelative(68.0f)
                lineTo(182.0f, 202.0f)
                lineTo(182.0f, 176.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 160.0f, 154.0f)
                close()
                moveTo(234.0f, 202.0f)
                lineTo(214.0f, 202.0f)
                lineTo(214.0f, 152.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null
