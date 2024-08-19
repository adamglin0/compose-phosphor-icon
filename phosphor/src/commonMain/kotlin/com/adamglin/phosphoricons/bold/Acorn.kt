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

public val BoldGroup.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 104.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f)
                lineTo(140.4f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 160.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, false, -43.81f, 40.0f)
                lineTo(80.0f, 44.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.0f, 16.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 37.45f, 34.0f, 64.71f, 61.23f, 86.61f)
                curveToRelative(10.22f, 8.2f, 25.63f, 20.58f, 26.77f, 25.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                curveToRelative(1.14f, -5.0f, 16.55f, -17.36f, 26.77f, -25.56f)
                curveTo(194.05f, 192.71f, 228.0f, 165.45f, 228.0f, 128.0f)
                verticalLineToRelative(-8.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 104.0f)
                close()
                moveTo(80.0f, 68.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, true, 35.78f, 32.0f)
                lineTo(44.22f, 100.0f)
                arcTo(36.06f, 36.06f, 0.0f, false, true, 80.0f, 68.0f)
                close()
                moveTo(151.74f, 195.9f)
                curveToRelative(-9.17f, 7.36f, -17.46f, 14.0f, -23.74f, 20.55f)
                curveToRelative(-6.28f, -6.53f, -14.57f, -13.19f, -23.74f, -20.55f)
                curveTo(81.0f, 177.2f, 52.0f, 153.94f, 52.0f, 128.0f)
                verticalLineToRelative(-4.0f)
                lineTo(204.0f, 124.0f)
                verticalLineToRelative(4.0f)
                curveTo(204.0f, 153.94f, 175.0f, 177.2f, 151.74f, 195.9f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null
