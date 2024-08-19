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

public val DuotoneGroup.`Coda-logo-duotone`: ImageVector
    get() {
        if (`_coda-logo-duotone` != null) {
            return `_coda-logo-duotone`!!
        }
        `_coda-logo-duotone` = Builder(name = "Coda-logo-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                curveToRelative(10.27f, 0.41f, 17.9f, -2.25f, 25.88f, -7.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 172.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.15f, 3.36f)
                arcTo(48.24f, 48.24f, 0.0f, false, false, 128.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 88.0f)
                arcToRelative(39.79f, 39.79f, 0.0f, false, true, 21.53f, 6.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 84.0f)
                lineTo(216.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(56.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.44f, -10.11f)
                curveToRelative(-7.25f, 4.65f, -13.41f, 6.41f, -21.24f, 6.11f)
                lineTo(176.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f)
                close()
                moveTo(120.0f, 128.0f)
                arcToRelative(56.07f, 56.07f, 0.0f, false, false, 55.84f, 56.0f)
                arcTo(48.4f, 48.4f, 0.0f, false, false, 200.0f, 178.89f)
                lineTo(200.0f, 208.0f)
                lineTo(56.0f, 208.0f)
                lineTo(56.0f, 48.0f)
                lineTo(200.0f, 48.0f)
                lineTo(200.0f, 77.23f)
                arcTo(56.3f, 56.3f, 0.0f, false, false, 120.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_coda-logo-duotone`!!
    }

private var `_coda-logo-duotone`: ImageVector? = null
