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

public val BoldGroup.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) {
            return _userCircleMinus!!
        }
        _userCircleMinus = Builder(name = "UserCircleMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(176.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 56.0f)
                close()
                moveTo(229.85f, 92.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcToRelative(109.19f, 109.19f, 0.0f, false, true, 18.0f, 1.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.0f, 23.67f)
                arcTo(85.0f, 85.0f, 0.0f, false, false, 128.0f, 44.0f)
                arcTo(83.94f, 83.94f, 0.0f, false, false, 62.05f, 179.94f)
                arcToRelative(83.48f, 83.48f, 0.0f, false, true, 29.0f, -23.42f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 74.0f, 0.0f)
                arcToRelative(83.36f, 83.36f, 0.0f, false, true, 29.0f, 23.42f)
                arcTo(83.94f, 83.94f, 0.0f, false, false, 207.22f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.63f, -8.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.53f, 83.53f, 0.0f, false, false, 48.43f, -15.43f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -96.86f, 0.0f)
                arcTo(83.53f, 83.53f, 0.0f, false, false, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
