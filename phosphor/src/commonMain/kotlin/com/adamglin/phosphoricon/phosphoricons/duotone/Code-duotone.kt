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

public val DuotoneGroup.`Code-duotone`: ImageVector
    get() {
        if (`_code-duotone` != null) {
            return `_code-duotone`!!
        }
        `_code-duotone` = Builder(name = "Code-duotone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 128.0f)
                lineToRelative(-48.0f, 40.0f)
                horizontalLineTo(64.0f)
                lineTo(16.0f, 128.0f)
                lineTo(64.0f, 88.0f)
                horizontalLineTo(192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(69.12f, 94.15f)
                lineTo(28.5f, 128.0f)
                lineToRelative(40.62f, 33.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.24f, 12.29f)
                lineToRelative(-48.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -12.29f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.24f, 12.3f)
                close()
                moveTo(245.12f, 121.85f)
                lineTo(197.12f, 81.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.24f, 12.3f)
                lineTo(227.5f, 128.0f)
                lineToRelative(-40.62f, 33.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.24f, 12.29f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.29f)
                close()
                moveTo(162.73f, 32.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.25f, 4.79f)
                lineToRelative(-64.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.79f, 10.26f)
                arcTo(8.14f, 8.14f, 0.0f, false, false, 96.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, -5.27f)
                lineToRelative(64.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 162.73f, 32.48f)
                close()
            }
        }
        .build()
        return `_code-duotone`!!
    }

private var `_code-duotone`: ImageVector? = null
