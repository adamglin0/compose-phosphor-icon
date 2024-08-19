package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Asclepius-light`: ImageVector
    get() {
        if (`_asclepius-light` != null) {
            return `_asclepius-light`!!
        }
        `_asclepius-light` = Builder(name = "Asclepius-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 79.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, 38.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(84.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 12.0f, -31.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.0f, -8.94f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 144.0f, 214.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(214.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(26.0f)
                verticalLineTo(118.0f)
                horizontalLineTo(96.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 0.0f, 36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, -60.0f)
                horizontalLineToRelative(26.0f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(82.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, -26.0f)
                verticalLineTo(79.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, -25.0f, -25.0f)
                horizontalLineTo(160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(37.0f, 37.0f, 0.0f, false, true, 37.0f, 37.0f)
                close()
                moveTo(56.0f, 94.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineTo(80.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 64.0f, 42.0f)
                horizontalLineTo(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(94.0f)
                verticalLineToRelative(2.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 56.0f, 94.0f)
                close()
                moveTo(82.0f, 54.0f)
                horizontalLineTo(64.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 38.0f, 80.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(56.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 82.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_asclepius-light`!!
    }

private var `_asclepius-light`: ImageVector? = null
