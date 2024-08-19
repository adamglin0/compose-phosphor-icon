package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Speakersimplelow: ImageVector
    get() {
        if (_speakersimplelow != null) {
            return _speakersimplelow!!
        }
        _speakersimplelow = Builder(name = "Speakersimplelow", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.27f, 21.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.64f, 1.31f)
                lineTo(83.88f, 76.0f)
                horizontalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(83.88f)
                lineToRelative(68.75f, 53.47f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 224.0f)
                verticalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 165.27f, 21.22f)
                close()
                moveTo(148.0f, 199.46f)
                lineTo(95.37f, 158.53f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 156.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(100.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.37f, -2.53f)
                lineTo(148.0f, 56.54f)
                close()
                moveTo(212.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _speakersimplelow!!
    }

private var _speakersimplelow: ImageVector? = null
