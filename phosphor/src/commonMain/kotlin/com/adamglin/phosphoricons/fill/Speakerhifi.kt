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

public val FillGroup.Speakerhifi: ImageVector
    get() {
        if (_speakerhifi != null) {
            return _speakerhifi!!
        }
        _speakerhifi = Builder(name = "Speakerhifi", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 160.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 160.0f)
                close()
                moveTo(208.0f, 40.0f)
                lineTo(208.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(64.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 24.0f)
                lineTo(192.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 40.0f)
                close()
                moveTo(116.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 68.0f)
                close()
                moveTo(168.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 168.0f, 160.0f)
                close()
            }
        }
        .build()
        return _speakerhifi!!
    }

private var _speakerhifi: ImageVector? = null
