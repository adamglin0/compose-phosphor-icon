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

public val BoldGroup.Eyeclosed: ImageVector
    get() {
        if (_eyeclosed != null) {
            return _eyeclosed!!
        }
        _eyeclosed = Builder(name = "Eyeclosed", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.42f, 162.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 213.58f, 174.0f)
                lineToRelative(-16.86f, -29.5f)
                arcToRelative(127.19f, 127.19f, 0.0f, false, true, -30.17f, 13.86f)
                lineTo(171.84f, 190.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.87f, 13.8f)
                arcToRelative(11.22f, 11.22f, 0.0f, false, true, -2.0f, 0.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.82f, -10.0f)
                lineTo(143.0f, 163.17f)
                arcToRelative(136.5f, 136.5f, 0.0f, false, true, -30.06f, 0.0f)
                lineTo(107.84f, 194.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 204.0f)
                arcToRelative(11.22f, 11.22f, 0.0f, false, true, -2.0f, -0.17f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.16f, 190.0f)
                lineToRelative(5.29f, -31.72f)
                arcToRelative(127.19f, 127.19f, 0.0f, false, true, -30.17f, -13.86f)
                lineTo(42.42f, 174.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 21.58f, 162.0f)
                lineTo(40.0f, 129.85f)
                arcToRelative(159.73f, 159.73f, 0.0f, false, true, -17.31f, -18.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 41.34f, 96.46f)
                curveTo(57.38f, 116.32f, 85.44f, 140.0f, 128.0f, 140.0f)
                reflectiveCurveToRelative(70.62f, -23.68f, 86.66f, -43.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.67f, 15.08f)
                arcTo(159.73f, 159.73f, 0.0f, false, true, 216.0f, 129.85f)
                close()
            }
        }
        .build()
        return _eyeclosed!!
    }

private var _eyeclosed: ImageVector? = null
