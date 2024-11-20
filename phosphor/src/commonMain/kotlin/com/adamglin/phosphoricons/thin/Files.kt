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

public val ThinGroup.Files: ImageVector
    get() {
        if (_files != null) {
            return _files!!
        }
        _files = Builder(name = "Files", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.83f, 69.17f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 168.0f, 28.0f)
                lineTo(88.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 40.0f)
                lineTo(76.0f, 60.0f)
                lineTo(56.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 72.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(168.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(180.0f, 196.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 69.17f)
                close()
                moveTo(172.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(78.34f)
                lineTo(172.0f, 105.66f)
                close()
                moveTo(204.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(180.0f, 188.0f)
                lineTo(180.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 136.0f, 60.0f)
                lineTo(84.0f, 60.0f)
                lineTo(84.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(78.34f)
                lineTo(204.0f, 73.66f)
                close()
                moveTo(140.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 152.0f)
                close()
                moveTo(140.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 184.0f)
                close()
            }
        }
        .build()
        return _files!!
    }

private var _files: ImageVector? = null
