package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Drone: ImageVector
    get() {
        if (_drone != null) {
            return _drone!!
        }
        _drone = Builder(name = "Drone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.83f, 74.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(150.34f, 100.0f)
                lineTo(105.66f, 100.0f)
                lineTo(74.83f, 69.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(100.0f, 105.66f)
                verticalLineToRelative(44.68f)
                lineTo(69.17f, 181.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(105.66f, 156.0f)
                horizontalLineToRelative(44.68f)
                lineToRelative(30.83f, 30.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(156.0f, 150.34f)
                lineTo(156.0f, 105.66f)
                close()
                moveTo(108.0f, 108.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(40.0f)
                lineTo(108.0f, 148.0f)
                close()
                moveTo(142.28f, 62.67f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 51.05f, 51.05f)
                arcTo(3.88f, 3.88f, 0.0f, false, true, 192.0f, 114.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.33f, -7.77f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -40.85f, -40.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.54f, -2.66f)
                close()
                moveTo(220.0f, 180.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -77.72f, 13.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.54f, -2.66f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 40.85f, -40.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.66f, -7.54f)
                arcTo(40.06f, 40.06f, 0.0f, false, true, 220.0f, 180.0f)
                close()
                moveTo(113.72f, 193.33f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -51.0f, -51.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.66f, 7.54f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 40.85f, 40.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.54f, 2.66f)
                close()
                moveTo(36.0f, 76.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 77.72f, -13.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.54f, 2.66f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -40.85f, 40.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 114.0f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, -1.33f, -0.23f)
                arcTo(40.06f, 40.06f, 0.0f, false, true, 36.0f, 76.0f)
                close()
            }
        }
        .build()
        return _drone!!
    }

private var _drone: ImageVector? = null
