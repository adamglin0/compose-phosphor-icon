package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Arrowbenddoubleupleft: ImageVector
    get() {
        if (_arrowbenddoubleupleft != null) {
            return _arrowbenddoubleupleft!!
        }
        _arrowbenddoubleupleft = Builder(name = "Arrowbenddoubleupleft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.24f, 147.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.48f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(40.49f, 104.0f)
                close()
                moveTo(128.0f, 98.0f)
                horizontalLineTo(94.49f)
                lineToRelative(37.75f, -37.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(94.49f, 110.0f)
                horizontalLineTo(128.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, 90.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 98.0f)
                close()
            }
        }
        .build()
        return _arrowbenddoubleupleft!!
    }

private var _arrowbenddoubleupleft: ImageVector? = null
