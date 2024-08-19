package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Arrowuupright: ImageVector
    get() {
        if (_arrowuupright != null) {
            return _arrowuupright!!
        }
        _arrowuupright = Builder(name = "Arrowuupright", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 88.0f)
                lineToRelative(-48.0f, 48.0f)
                verticalLineTo(40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.94f, 143.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.72f, -1.73f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineToRelative(-48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 40.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 172.94f, 143.39f)
                close()
                moveTo(184.0f, 59.31f)
                lineTo(212.69f, 88.0f)
                lineTo(184.0f, 116.69f)
                close()
            }
        }
        .build()
        return _arrowuupright!!
    }

private var _arrowuupright: ImageVector? = null
