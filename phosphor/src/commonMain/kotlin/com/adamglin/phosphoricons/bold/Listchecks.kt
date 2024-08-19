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

public val BoldGroup.Listchecks: ImageVector
    get() {
        if (_listchecks != null) {
            return _listchecks!!
        }
        _listchecks = Builder(name = "Listchecks", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(128.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(128.0f, 76.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(128.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(216.0f, 180.0f)
                lineTo(128.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(79.51f, 39.51f)
                lineTo(56.0f, 63.0f)
                lineToRelative(-7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                close()
                moveTo(79.51f, 103.51f)
                lineTo(56.0f, 127.0f)
                lineToRelative(-7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                close()
                moveTo(79.51f, 167.51f)
                lineTo(56.0f, 191.0f)
                lineToRelative(-7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                close()
            }
        }
        .build()
        return _listchecks!!
    }

private var _listchecks: ImageVector? = null
