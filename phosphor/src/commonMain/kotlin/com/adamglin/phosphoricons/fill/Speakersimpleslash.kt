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

public val FillGroup.Speakersimpleslash: ImageVector
    get() {
        if (_speakersimpleslash != null) {
            return _speakersimpleslash!!
        }
        _speakersimpleslash = Builder(name = "Speakersimpleslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(168.0f, 175.09f)
                verticalLineToRelative(48.6f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, true, -3.91f, 7.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.0f, -0.56f)
                lineTo(85.25f, 176.0f)
                horizontalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 80.0f)
                horizontalLineTo(81.55f)
                lineTo(50.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 61.92f, 34.62f)
                close()
                moveTo(200.53f, 160.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f)
                verticalLineTo(104.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 200.53f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.53f, 8.0f)
                verticalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.53f, 160.0f)
                close()
                moveTo(161.0f, 119.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.7f)
                verticalLineTo(32.24f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, false, -2.88f, -6.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, -0.16f)
                lineTo(111.83f, 59.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.5f, 5.85f)
                close()
                moveTo(231.47f, 80.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 224.0f, 88.27f)
                verticalLineToRelative(79.46f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                verticalLineTo(88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 231.47f, 80.0f)
                close()
            }
        }
        .build()
        return _speakersimpleslash!!
    }

private var _speakersimpleslash: ImageVector? = null
