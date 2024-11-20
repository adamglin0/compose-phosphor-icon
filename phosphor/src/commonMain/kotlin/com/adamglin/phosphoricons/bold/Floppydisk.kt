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

public val BoldGroup.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) {
            return _floppyDisk!!
        }
        _floppyDisk = Builder(name = "FloppyDisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.14f, 69.17f)
                lineTo(186.83f, 33.86f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 172.69f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 83.31f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 222.14f, 69.17f)
                close()
                moveTo(164.0f, 204.0f)
                lineTo(92.0f, 204.0f)
                lineTo(92.0f, 160.0f)
                horizontalLineToRelative(72.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(188.0f, 204.0f)
                lineTo(188.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(88.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(48.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(171.0f, 52.0f)
                lineToRelative(33.0f, 33.0f)
                close()
                moveTo(164.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 84.0f)
                close()
            }
        }
        .build()
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
