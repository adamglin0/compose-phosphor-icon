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

public val ThinGroup.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) {
            return _bookmarks!!
        }
        _bookmarks = Builder(name = "Bookmarks", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 28.0f)
                lineTo(96.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 40.0f)
                lineTo(84.0f, 60.0f)
                lineTo(64.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 72.0f)
                lineTo(52.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.33f, 3.25f)
                lineTo(112.0f, 188.92f)
                lineToRelative(53.69f, 38.33f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 168.0f, 228.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 1.83f, -0.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 172.0f, 224.0f)
                lineTo(172.0f, 176.92f)
                lineToRelative(25.68f, 18.33f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 200.0f, 196.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 1.83f, -0.44f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 204.0f, 192.0f)
                lineTo(204.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 28.0f)
                close()
                moveTo(164.0f, 216.23f)
                lineToRelative(-49.68f, -35.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.65f, 0.0f)
                lineTo(60.0f, 216.23f)
                lineTo(60.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(196.0f, 184.23f)
                lineTo(172.0f, 167.09f)
                lineTo(172.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(92.0f, 60.0f)
                lineTo(92.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
