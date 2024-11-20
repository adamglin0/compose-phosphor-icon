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

public val LightGroup.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) {
            return _speakerSimpleNone!!
        }
        _speakerSimpleNone = Builder(name = "SpeakerSimpleNone", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.64f, 26.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.32f, 0.65f)
                lineTo(85.94f, 82.0f)
                horizontalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(85.94f)
                lineToRelative(70.38f, 54.74f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 166.0f, 224.0f)
                verticalLineTo(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 162.64f, 26.61f)
                close()
                moveTo(154.0f, 211.73f)
                lineTo(91.68f, 163.26f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 162.0f)
                horizontalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.68f, -1.26f)
                lineTo(154.0f, 44.27f)
                close()
            }
        }
        .build()
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
