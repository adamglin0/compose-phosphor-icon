package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Numbereight: ImageVector
    get() {
        if (_numbereight != null) {
            return _numbereight!!
        }
        _numbereight = Builder(name = "Numbereight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 92.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 92.0f)
                close()
                moveTo(128.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 128.0f)
                close()
                moveTo(216.0f, 40.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(56.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                lineTo(200.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 40.0f)
                close()
                moveTo(172.0f, 156.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -20.23f, -37.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -47.54f, 0.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 172.0f, 156.0f)
                close()
            }
        }
        .build()
        return _numbereight!!
    }

private var _numbereight: ImageVector? = null
