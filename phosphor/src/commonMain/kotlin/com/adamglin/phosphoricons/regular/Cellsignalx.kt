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

public val RegularGroup.Cellsignalx: ImageVector
    get() {
        if (_cellsignalx != null) {
            return _cellsignalx!!
        }
        _cellsignalx = Builder(name = "Cellsignalx", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 194.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(184.0f, 187.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(172.69f, 176.0f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(184.0f, 164.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(195.31f, 176.0f)
                close()
                moveTo(160.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(168.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 120.0f)
                close()
                moveTo(200.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(208.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 120.0f)
                close()
                moveTo(120.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(128.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 104.0f)
                close()
                moveTo(80.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 144.0f)
                close()
                moveTo(40.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 184.0f)
                close()
            }
        }
        .build()
        return _cellsignalx!!
    }

private var _cellsignalx: ImageVector? = null
