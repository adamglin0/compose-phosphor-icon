package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Currency-inr-thin`: ImageVector
    get() {
        if (`_currency-inr-thin` != null) {
            return `_currency-inr-thin`!!
        }
        `_currency-inr-thin` = Builder(name = "Currency-inr-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(163.42f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, true, 0.58f, 8.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -56.0f, 56.0f)
                horizontalLineTo(82.35f)
                lineToRelative(80.34f, 73.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.38f, 5.92f)
                lineToRelative(-88.0f, -80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 140.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 47.32f, -56.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(81.25f)
                arcTo(48.09f, 48.09f, 0.0f, false, false, 108.0f, 44.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(136.81f)
                arcToRelative(56.24f, 56.24f, 0.0f, false, true, 24.85f, 32.0f)
                horizontalLineTo(200.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_currency-inr-thin`!!
    }

private var `_currency-inr-thin`: ImageVector? = null
