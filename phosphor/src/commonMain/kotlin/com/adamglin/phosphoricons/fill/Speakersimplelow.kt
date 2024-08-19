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

public val FillGroup.Speakersimplelow: ImageVector
    get() {
        if (_speakersimplelow != null) {
            return _speakersimplelow!!
        }
        _speakersimplelow = Builder(name = "Speakersimplelow", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 32.0f)
                lineTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.91f, 6.31f)
                lineTo(85.25f, 176.0f)
                lineTo(40.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 80.0f)
                lineTo(85.25f, 80.0f)
                lineToRelative(69.84f, -54.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 32.0f)
                close()
                moveTo(200.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 96.0f)
                close()
            }
        }
        .build()
        return _speakersimplelow!!
    }

private var _speakersimplelow: ImageVector? = null
