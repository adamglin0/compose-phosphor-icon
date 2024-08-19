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

public val DuotoneGroup.Arrowbendrightdown: ImageVector
    get() {
        if (_arrowbendrightdown != null) {
            return _arrowbendrightdown!!
        }
        _arrowbendrightdown = Builder(name = "Arrowbendrightdown", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 176.0f)
                lineToRelative(-48.0f, 48.0f)
                lineToRelative(-48.0f, -48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.39f, 172.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 168.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 56.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 88.0f, 88.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 207.39f, 172.94f)
                close()
                moveTo(152.0f, 212.69f)
                lineTo(123.31f, 184.0f)
                horizontalLineToRelative(57.38f)
                close()
            }
        }
        .build()
        return _arrowbendrightdown!!
    }

private var _arrowbendrightdown: ImageVector? = null
