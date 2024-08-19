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

public val ThinGroup.Speakersimplenone: ImageVector
    get() {
        if (_speakersimplenone != null) {
            return _speakersimplenone!!
        }
        _speakersimplenone = Builder(name = "Speakersimplenone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.76f, 28.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.22f, 0.43f)
                lineTo(86.63f, 84.0f)
                horizontalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(86.63f)
                lineToRelative(70.91f, 55.16f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 160.0f, 228.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.76f, -0.41f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 224.0f)
                verticalLineTo(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 161.76f, 28.41f)
                close()
                moveTo(156.0f, 215.82f)
                lineToRelative(-65.54f, -51.0f)
                arcTo(4.06f, 4.06f, 0.0f, false, false, 88.0f, 164.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, 2.46f, -0.84f)
                lineToRelative(65.54f, -51.0f)
                close()
            }
        }
        .build()
        return _speakersimplenone!!
    }

private var _speakersimplenone: ImageVector? = null
