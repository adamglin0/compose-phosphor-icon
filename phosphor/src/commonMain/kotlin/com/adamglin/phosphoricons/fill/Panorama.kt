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

public val FillGroup.Panorama: ImageVector
    get() {
        if (_panorama != null) {
            return _panorama!!
        }
        _panorama = Builder(name = "Panorama", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.75f, 51.32f)
                arcToRelative(15.87f, 15.87f, 0.0f, false, false, -13.86f, -2.77f)
                lineToRelative(-3.48f, 0.94f)
                curveTo(205.61f, 54.56f, 170.61f, 64.0f, 128.0f, 64.0f)
                reflectiveCurveTo(50.39f, 54.56f, 31.59f, 49.49f)
                lineToRelative(-3.48f, -0.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 64.0f)
                lineTo(8.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcToRelative(16.22f, 16.22f, 0.0f, false, false, 4.18f, -0.55f)
                lineToRelative(3.18f, -0.86f)
                curveTo(50.13f, 201.49f, 85.17f, 192.0f, 128.0f, 192.0f)
                reflectiveCurveToRelative(77.87f, 9.49f, 96.69f, 14.59f)
                lineToRelative(3.18f, 0.86f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 248.0f, 192.0f)
                lineTo(248.0f, 64.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 241.75f, 51.32f)
                close()
                moveTo(204.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 96.0f)
                close()
                moveTo(128.0f, 176.0f)
                curveToRelative(-45.0f, 0.0f, -82.72f, 10.23f, -100.87f, 15.14f)
                lineTo(24.0f, 192.0f)
                verticalLineToRelative(-39.3f)
                lineToRelative(46.34f, -46.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineTo(152.28f, 177.0f)
                curveTo(144.49f, 176.35f, 136.37f, 176.0f, 128.0f, 176.0f)
                close()
                moveTo(228.87f, 191.14f)
                arcToRelative(448.7f, 448.7f, 0.0f, false, false, -51.0f, -11.2f)
                lineToRelative(-35.26f, -35.26f)
                lineTo(157.0f, 130.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 0.0f)
                lineToRelative(60.89f, 60.88f)
                close()
            }
        }
        .build()
        return _panorama!!
    }

private var _panorama: ImageVector? = null
