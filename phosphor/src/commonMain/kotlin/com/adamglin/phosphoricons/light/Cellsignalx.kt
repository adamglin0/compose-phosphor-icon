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

public val LightGroup.Cellsignalx: ImageVector
    get() {
        if (_cellsignalx != null) {
            return _cellsignalx!!
        }
        _cellsignalx = Builder(name = "Cellsignalx", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.24f, 195.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(184.0f, 184.48f)
                lineToRelative(-19.76f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(175.52f, 176.0f)
                lineToRelative(-19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(184.0f, 167.52f)
                lineToRelative(19.76f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(192.48f, 176.0f)
                close()
                moveTo(160.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(166.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 118.0f)
                close()
                moveTo(200.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(206.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 118.0f)
                close()
                moveTo(120.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(126.0f, 112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 106.0f)
                close()
                moveTo(80.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(86.0f, 152.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.0f, 146.0f)
                close()
                moveTo(40.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 186.0f)
                close()
            }
        }
        .build()
        return _cellsignalx!!
    }

private var _cellsignalx: ImageVector? = null
