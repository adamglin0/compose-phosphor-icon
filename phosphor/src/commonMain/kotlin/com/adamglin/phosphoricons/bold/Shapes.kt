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

public val BoldGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.49f, 60.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.0f, 0.0f)
                lineToRelative(-36.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 196.0f)
                lineTo(96.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.49f, -15.45f)
                close()
                moveTo(40.13f, 172.0f)
                lineTo(60.0f, 105.76f)
                lineTo(79.87f, 172.0f)
                close()
                moveTo(212.0f, 74.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, -54.0f, 54.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 212.0f, 74.0f)
                close()
                moveTo(128.0f, 74.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, 30.0f, 30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 128.0f, 74.0f)
                close()
                moveTo(224.0f, 144.0f)
                lineTo(136.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 156.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 144.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(148.0f, 196.0f)
                lineTo(148.0f, 168.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null
