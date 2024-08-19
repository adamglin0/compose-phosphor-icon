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

public val ThinGroup.Bandaids: ImageVector
    get() {
        if (_bandaids != null) {
            return _bandaids!!
        }
        _bandaids = Builder(name = "Bandaids", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.91f, 128.0f)
                lineToRelative(30.55f, -30.54f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, -50.92f)
                lineTo(128.0f, 77.09f)
                lineTo(97.46f, 46.54f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 46.54f, 97.46f)
                lineTo(77.09f, 128.0f)
                lineTo(46.54f, 158.54f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.92f, 50.92f)
                lineTo(128.0f, 178.91f)
                lineToRelative(30.54f, 30.55f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.92f, -50.92f)
                close()
                moveTo(164.2f, 52.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.6f, 39.6f)
                lineToRelative(-30.55f, 30.54f)
                lineTo(133.66f, 82.75f)
                close()
                moveTo(167.6f, 128.0f)
                lineTo(128.0f, 167.6f)
                lineTo(88.4f, 128.0f)
                lineTo(128.0f, 88.4f)
                close()
                moveTo(52.2f, 91.8f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 91.8f, 52.2f)
                lineToRelative(30.54f, 30.55f)
                lineTo(82.75f, 122.34f)
                close()
                moveTo(91.8f, 203.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.6f, -39.6f)
                lineToRelative(30.55f, -30.54f)
                lineToRelative(39.59f, 39.59f)
                close()
                moveTo(203.8f, 203.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.6f, 0.0f)
                lineToRelative(-30.54f, -30.55f)
                lineToRelative(39.59f, -39.59f)
                lineTo(203.8f, 164.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 39.6f)
                close()
                moveTo(120.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                close()
            }
        }
        .build()
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
