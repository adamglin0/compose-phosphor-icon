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

public val LightGroup.Eyeclosed: ImageVector
    get() {
        if (_eyeclosed != null) {
            return _eyeclosed!!
        }
        _eyeclosed = Builder(name = "Eyeclosed", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.21f, 165.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.42f, 6.0f)
                lineToRelative(-20.0f, -35.08f)
                arcToRelative(122.0f, 122.0f, 0.0f, false, true, -39.0f, 18.09f)
                lineToRelative(6.17f, 37.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.93f, 6.91f)
                arcToRelative(6.85f, 6.85f, 0.0f, false, true, -1.0f, 0.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, -5.0f)
                lineTo(148.0f, 156.44f)
                arcToRelative(128.86f, 128.86f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(101.92f, 193.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 198.0f)
                arcToRelative(6.85f, 6.85f, 0.0f, false, true, -1.0f, -0.08f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.08f, 191.0f)
                lineToRelative(6.17f, -37.0f)
                arcToRelative(122.0f, 122.0f, 0.0f, false, true, -39.0f, -18.09f)
                lineTo(37.21f, 171.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.42f, -6.0f)
                lineToRelative(20.85f, -36.48f)
                arcToRelative(152.0f, 152.0f, 0.0f, false, true, -20.31f, -20.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.34f, -7.54f)
                curveTo(53.54f, 121.11f, 83.07f, 146.0f, 128.0f, 146.0f)
                reflectiveCurveToRelative(74.46f, -24.89f, 91.33f, -45.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.34f, 7.54f)
                arcToRelative(152.0f, 152.0f, 0.0f, false, true, -20.31f, 20.77f)
                close()
            }
        }
        .build()
        return _eyeclosed!!
    }

private var _eyeclosed: ImageVector? = null
