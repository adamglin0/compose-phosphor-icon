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

public val ThinGroup.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 52.0f)
                lineTo(172.0f, 52.0f)
                lineTo(172.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(104.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 40.0f)
                lineTo(84.0f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 60.0f)
                lineTo(52.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 60.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(92.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(164.0f, 52.0f)
                lineTo(92.0f, 52.0f)
                close()
                moveTo(196.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(60.0f, 60.0f)
                lineTo(196.0f, 60.0f)
                close()
                moveTo(108.0f, 104.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(100.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(156.0f, 104.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(148.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
