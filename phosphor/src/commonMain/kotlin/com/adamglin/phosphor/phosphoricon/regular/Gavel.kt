package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.32f, 116.69f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -20.84f, -1.53f)
                lineTo(156.84f, 49.52f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.52f, -20.84f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.83f, 1.52f)
                lineTo(96.69f, 124.0f)
                lineTo(31.31f, 189.38f)
                arcTo(25.0f, 25.0f, 0.0f, false, false, 66.63f, 224.7f)
                lineTo(132.0f, 159.32f)
                lineToRelative(7.17f, 7.16f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.52f, 20.84f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 243.32f, 116.69f)
                close()
                moveTo(80.0f, 104.0f)
                lineTo(64.0f, 88.0f)
                lineToRelative(64.0f, -64.0f)
                lineToRelative(16.0f, 16.0f)
                close()
                moveTo(55.32f, 213.38f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -12.69f, 0.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, -12.68f)
                lineTo(108.0f, 135.32f)
                lineTo(120.69f, 148.0f)
                close()
                moveTo(101.0f, 105.66f)
                lineTo(145.66f, 61.0f)
                lineTo(195.0f, 110.34f)
                lineTo(150.35f, 155.0f)
                close()
                moveTo(168.0f, 192.0f)
                lineToRelative(-16.0f, -16.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(56.0f, -56.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
