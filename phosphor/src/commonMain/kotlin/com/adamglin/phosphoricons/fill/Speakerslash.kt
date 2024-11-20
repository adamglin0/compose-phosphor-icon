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

public val FillGroup.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) {
            return _speakerSlash!!
        }
        _speakerSlash = Builder(name = "SpeakerSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(160.0f, 175.09f)
                verticalLineToRelative(48.6f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, true, -3.91f, 7.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.0f, -0.56f)
                lineToRelative(-65.55f, -51.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 176.18f)
                lineTo(80.0f, 87.09f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(186.71f, 155.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.29f, -0.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -52.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.0f, 10.57f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 31.72f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 186.71f, 155.16f)
                close()
                moveTo(227.63f, 74.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.92f, 10.66f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 0.0f, 85.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.92f, 10.66f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -106.66f)
                close()
                moveTo(153.0f, 119.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.7f)
                lineTo(160.0f, 32.25f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, false, -2.88f, -6.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, -0.16f)
                lineTo(103.83f, 59.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.5f, 5.85f)
                close()
                moveTo(60.0f, 80.0f)
                lineTo(32.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(60.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(64.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 80.0f)
                close()
            }
        }
        .build()
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
