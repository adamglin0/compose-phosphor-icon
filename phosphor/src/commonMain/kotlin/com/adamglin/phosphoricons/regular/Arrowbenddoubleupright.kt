package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Arrowbenddoubleupright: ImageVector
    get() {
        if (_arrowbenddoubleupright != null) {
            return _arrowbenddoubleupright!!
        }
        _arrowbenddoubleupright = Builder(name = "Arrowbenddoubleupright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 109.66f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(212.69f, 104.0f)
                lineTo(170.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 109.66f)
                close()
                moveTo(181.66f, 98.34f)
                lineTo(133.66f, 50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(156.69f, 96.0f)
                lineTo(128.0f, 96.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 24.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 88.0f, -88.0f)
                horizontalLineToRelative(28.69f)
                lineToRelative(-34.35f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 181.66f, 98.34f)
                close()
            }
        }
        .build()
        return _arrowbenddoubleupright!!
    }

private var _arrowbenddoubleupright: ImageVector? = null
