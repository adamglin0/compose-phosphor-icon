package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Lastfm-logo-fill`: ImageVector
    get() {
        if (`_lastfm-logo-fill` != null) {
            return `_lastfm-logo-fill`!!
        }
        `_lastfm-logo-fill` = Builder(name = "Lastfm-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(184.0f, 184.0f)
                horizontalLineTo(172.61f)
                arcToRelative(40.09f, 40.09f, 0.0f, false, true, -36.42f, -23.45f)
                lineToRelative(-23.0f, -50.48f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 91.39f, 96.0f)
                horizontalLineTo(80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, false, 18.74f, -9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.48f, 10.0f)
                arcTo(39.83f, 39.83f, 0.0f, false, true, 88.0f, 184.0f)
                horizontalLineTo(80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                verticalLineTo(120.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 80.0f, 80.0f)
                horizontalLineTo(91.39f)
                arcToRelative(40.09f, 40.09f, 0.0f, false, true, 36.42f, 23.45f)
                lineToRelative(22.95f, 50.48f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 172.61f, 168.0f)
                horizontalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return `_lastfm-logo-fill`!!
    }

private var `_lastfm-logo-fill`: ImageVector? = null
