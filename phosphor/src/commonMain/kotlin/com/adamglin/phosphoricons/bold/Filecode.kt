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

public val BoldGroup.Filecode: ImageVector
    get() {
        if (_filecode != null) {
            return _filecode!!
        }
        _filecode = Builder(name = "Filecode", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.49f, 143.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(155.0f, 152.0f)
                lineToRelative(-15.52f, -15.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                close()
                moveTo(116.49f, 119.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(101.0f, 152.0f)
                lineToRelative(15.52f, -15.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.49f, 119.51f)
                close()
                moveTo(220.0f, 88.0f)
                lineTo(220.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(56.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(36.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 56.0f, 20.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.49f, 3.52f)
                lineToRelative(56.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 88.0f)
                close()
                moveTo(160.0f, 57.0f)
                lineTo(160.0f, 80.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(196.0f, 212.0f)
                lineTo(196.0f, 104.0f)
                lineTo(148.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(136.0f, 44.0f)
                lineTo(60.0f, 44.0f)
                lineTo(60.0f, 212.0f)
                close()
            }
        }
        .build()
        return _filecode!!
    }

private var _filecode: ImageVector? = null
