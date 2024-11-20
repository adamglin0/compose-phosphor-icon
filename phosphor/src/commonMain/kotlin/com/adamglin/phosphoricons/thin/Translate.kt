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

public val ThinGroup.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.58f, 214.21f)
                lineToRelative(-56.0f, -112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.16f, 0.0f)
                lineTo(157.55f, 148.0f)
                arcTo(92.05f, 92.05f, 0.0f, false, true, 102.0f, 127.36f)
                arcTo(99.68f, 99.68f, 0.0f, false, false, 131.91f, 60.0f)
                horizontalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(100.0f)
                verticalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(91.91f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 96.0f, 122.05f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 73.23f, 86.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.54f, 2.66f)
                arcToRelative(99.59f, 99.59f, 0.0f, false, false, 24.3f, 38.0f)
                arcTo(91.59f, 91.59f, 0.0f, false, true, 32.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(99.54f, 99.54f, 0.0f, false, false, 64.0f, -23.21f)
                arcToRelative(100.09f, 100.09f, 0.0f, false, false, 57.66f, 23.0f)
                lineToRelative(-29.22f, 58.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.16f, 3.58f)
                lineTo(146.47f, 188.0f)
                horizontalLineToRelative(75.06f)
                lineToRelative(14.89f, 29.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 220.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, false, 1.79f, -0.42f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.58f, 214.21f)
                close()
                moveTo(150.47f, 180.0f)
                lineTo(184.0f, 112.94f)
                lineTo(217.53f, 180.0f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
