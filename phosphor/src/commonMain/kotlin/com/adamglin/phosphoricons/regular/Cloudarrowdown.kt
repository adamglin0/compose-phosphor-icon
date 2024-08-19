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

public val RegularGroup.Cloudarrowdown: ImageVector
    get() {
        if (_cloudarrowdown != null) {
            return _cloudarrowdown!!
        }
        _cloudarrowdown = Builder(name = "Cloudarrowdown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(87.34f, 87.34f, 0.0f, false, true, -17.6f, 52.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.62f)
                arcTo(71.34f, 71.34f, 0.0f, false, false, 232.0f, 128.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -144.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 3.29f, -23.88f)
                curveTo(74.2f, 104.0f, 73.1f, 104.0f, 72.0f, 104.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, 96.0f)
                lineTo(96.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(72.0f, 216.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 81.29f, 88.68f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
                moveTo(178.34f, 170.34f)
                lineTo(160.0f, 188.69f)
                lineTo(160.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(60.69f)
                lineToRelative(-18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _cloudarrowdown!!
    }

private var _cloudarrowdown: ImageVector? = null
