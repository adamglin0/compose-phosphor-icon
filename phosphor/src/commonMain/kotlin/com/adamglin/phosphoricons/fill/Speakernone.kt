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

public val FillGroup.SpeakerNone: ImageVector
    get() {
        if (_speakerNone != null) {
            return _speakerNone!!
        }
        _speakerNone = Builder(name = "SpeakerNone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 84.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 80.0f)
                lineTo(60.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 84.0f)
                close()
                moveTo(157.15f, 25.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, -0.16f)
                lineToRelative(-65.57f, 51.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 80.0f, 79.84f)
                verticalLineToRelative(96.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.55f, 3.15f)
                lineToRelative(65.57f, 51.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.0f, 0.56f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, false, 3.91f, -7.18f)
                lineTo(160.03f, 32.25f)
                arcTo(8.27f, 8.27f, 0.0f, false, false, 157.12f, 25.85f)
                close()
            }
        }
        .build()
        return _speakerNone!!
    }

private var _speakerNone: ImageVector? = null
