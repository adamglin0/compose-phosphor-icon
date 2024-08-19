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

public val BoldGroup.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) {
            return _bookmarks!!
        }
        _bookmarks = Builder(name = "Bookmarks", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 20.0f)
                lineTo(96.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 76.0f, 40.0f)
                lineTo(76.0f, 60.0f)
                lineTo(64.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 80.0f)
                lineTo(44.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.32f, 9.51f)
                lineTo(108.0f, 199.14f)
                lineToRelative(44.69f, 34.37f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 224.0f)
                lineTo(172.0f, 177.6f)
                lineToRelative(20.68f, 15.91f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 212.0f, 184.0f)
                lineTo(212.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 192.0f, 20.0f)
                close()
                moveTo(148.0f, 199.63f)
                lineToRelative(-32.69f, -25.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.63f, 0.0f)
                lineTo(68.0f, 199.63f)
                lineTo(68.0f, 84.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(188.0f, 159.63f)
                lineTo(172.0f, 147.33f)
                lineTo(172.0f, 80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(100.0f, 60.0f)
                lineTo(100.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                close()
            }
        }
        .build()
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
