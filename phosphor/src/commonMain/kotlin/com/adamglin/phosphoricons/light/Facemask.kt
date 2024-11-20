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

public val LightGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 104.0f)
                close()
                moveTo(168.0f, 130.0f)
                lineTo(88.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(254.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-6.81f, 15.88f, -21.28f, 29.6f, -42.82f, 40.37f)
                arcToRelative(189.0f, 189.0f, 0.0f, false, true, -45.61f, 15.53f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, true, -2.14f, 0.0f)
                arcToRelative(189.0f, 189.0f, 0.0f, false, true, -45.61f, -15.53f)
                curveTo(59.78f, 187.6f, 45.31f, 173.88f, 38.5f, 158.0f)
                lineTo(32.0f, 158.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 2.0f, 128.0f)
                lineTo(2.0f, 104.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 32.0f, 74.0f)
                horizontalLineToRelative(2.35f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 8.87f, -10.07f)
                lineToRelative(80.0f, -29.09f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 9.56f, 0.0f)
                lineToRelative(80.0f, 29.09f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 221.65f, 74.0f)
                lineTo(224.0f, 74.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 254.0f, 104.0f)
                close()
                moveTo(34.89f, 146.0f)
                arcTo(57.0f, 57.0f, 0.0f, false, true, 34.0f, 136.0f)
                lineTo(34.0f, 86.0f)
                lineTo(32.0f, 86.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, 18.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f)
                close()
                moveTo(210.0f, 136.0f)
                lineTo(210.0f, 77.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.32f, -1.88f)
                lineToRelative(-80.0f, -29.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.36f, 0.0f)
                lineToRelative(-80.0f, 29.09f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 46.0f, 77.09f)
                lineTo(46.0f, 136.0f)
                curveToRelative(0.0f, 20.7f, 13.61f, 38.0f, 40.46f, 51.52f)
                arcTo(180.79f, 180.79f, 0.0f, false, false, 128.0f, 201.88f)
                arcToRelative(181.0f, 181.0f, 0.0f, false, false, 41.54f, -14.36f)
                curveTo(196.39f, 174.0f, 210.0f, 156.7f, 210.0f, 136.0f)
                close()
                moveTo(242.0f, 104.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, true, -0.89f, 10.0f)
                lineTo(224.0f, 146.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
