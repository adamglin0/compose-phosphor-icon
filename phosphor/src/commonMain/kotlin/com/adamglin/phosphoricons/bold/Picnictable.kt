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

public val BoldGroup.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) {
            return _picnicTable!!
        }
        _picnicTable = Builder(name = "PicnicTable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 124.0f)
                horizontalLineTo(203.42f)
                lineToRelative(-24.0f, -48.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(76.58f)
                lineToRelative(-24.0f, 48.0f)
                horizontalLineTo(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(40.58f)
                lineTo(21.27f, 186.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.46f, 10.73f)
                lineTo(67.42f, 148.0f)
                horizontalLineTo(188.58f)
                lineToRelative(24.69f, 49.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.46f, -10.73f)
                lineTo(215.42f, 148.0f)
                horizontalLineTo(244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(79.42f, 124.0f)
                lineToRelative(24.0f, -48.0f)
                horizontalLineToRelative(49.16f)
                lineToRelative(24.0f, 48.0f)
                close()
            }
        }
        .build()
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
