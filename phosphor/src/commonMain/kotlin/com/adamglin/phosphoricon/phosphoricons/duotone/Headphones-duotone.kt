package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Headphones-duotone`: ImageVector
    get() {
        if (`_headphones-duotone` != null) {
            return `_headphones-duotone`!!
        }
        `_headphones-duotone` = Builder(name = "Headphones-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 144.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 128.0f)
                lineTo(64.0f, 128.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 144.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.89f, 54.66f)
                arcTo(104.08f, 104.08f, 0.0f, false, false, 24.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(64.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(88.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(40.36f, 120.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 40.0f)
                horizontalLineToRelative(0.67f)
                arcToRelative(87.71f, 87.71f, 0.0f, false, true, 87.0f, 80.0f)
                lineTo(192.0f, 120.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(232.0f, 128.0f)
                arcTo(103.41f, 103.41f, 0.0f, false, false, 201.89f, 54.66f)
                close()
                moveTo(64.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 136.0f)
                close()
                moveTo(216.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(192.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(184.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return `_headphones-duotone`!!
    }

private var `_headphones-duotone`: ImageVector? = null
