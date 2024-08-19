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

public val LightGroup.`Toolbox-light`: ImageVector
    get() {
        if (`_toolbox-light` != null) {
            return `_toolbox-light`!!
        }
        `_toolbox-light` = Builder(name = "Toolbox-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 66.0f)
                horizontalLineTo(174.0f)
                verticalLineTo(56.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                horizontalLineTo(104.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 82.0f, 56.0f)
                verticalLineTo(66.0f)
                horizontalLineTo(32.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 80.0f)
                verticalLineTo(192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(224.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 66.0f)
                close()
                moveTo(94.0f, 56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineTo(66.0f)
                horizontalLineTo(94.0f)
                close()
                moveTo(32.0f, 78.0f)
                horizontalLineTo(224.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(34.0f)
                horizontalLineTo(190.0f)
                verticalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(78.0f)
                verticalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(30.0f)
                verticalLineTo(80.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 32.0f, 78.0f)
                close()
                moveTo(224.0f, 194.0f)
                horizontalLineTo(32.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(126.0f)
                horizontalLineTo(66.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(126.0f)
                horizontalLineTo(178.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(126.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(66.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 224.0f, 194.0f)
                close()
            }
        }
        .build()
        return `_toolbox-light`!!
    }

private var `_toolbox-light`: ImageVector? = null
